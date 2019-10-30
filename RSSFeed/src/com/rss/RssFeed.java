package com.rss;

public class RssFeed {

	public static void main(String[] args) {

		RSSFeedParser parser = new RSSFeedParser("https://www.thehindu.com/sci-tech/agriculture/?service=rss");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);
	}
	}

}
