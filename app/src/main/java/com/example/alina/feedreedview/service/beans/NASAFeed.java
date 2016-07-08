package com.example.alina.feedreedview.service.beans;

import java.util.List;

public class NASAFeed {
    public String status;
    public String errorMessage;
    public Feed feed;
    public List<FeedInfo> items;

    public boolean isSuccess() {
        return "ok".equalsIgnoreCase(status);
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Feed getFeed() {
        return feed;
    }

    public List<FeedInfo> getFeedInfoList() {
        return items;
    }

    public class Feed {
        public String title;
        public String link;
        public String author;
        public String description;
        public String image;
    }

    public class FeedInfo {
        public String title;
        public String link;
        public String guid;
        public String pubDate;
        public String Categories;
        public String author;
        public String thumbnail;
        public String description;
        public String content;
        public Enclosure enclosure;

        public class Enclosure {
            public String link;
            public String type;
            public String length;
        }

    }

}
