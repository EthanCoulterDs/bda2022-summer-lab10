import com.danielasfregola.twitter4s.TwitterStreamingClient
import com.danielasfregola.twitter4s.entities.Tweet
import com.typesafe.scalalogging.LazyLogging

object TweetStreaming extends App with LazyLogging {

  // Make sure to define the following env variables:
  // TWITTER_CONSUMER_TOKEN_KEY (api key) and TWITTER_CONSUMER_TOKEN_SECRET (api secret)
  // TWITTER_ACCESS_TOKEN_KEY (access token) and TWITTER_ACCESS_TOKEN_SECRET (access secret)
  val streamingClient = TwitterStreamingClient()

  val trackedWords = Seq("#cat")

  streamingClient.filterStatuses(tracks = trackedWords) {
    case tweet: Tweet => logger.info(tweet.user.get.name + " (" + tweet.user.get.id + "): "
      + tweet.text + " (" + tweet.id + ")")
  }

}
