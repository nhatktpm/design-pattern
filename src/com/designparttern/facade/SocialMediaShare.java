package com.designparttern.facade;

public class SocialMediaShare {
    private  FBShare fbShare;
    private TwitterShare twitterShare;

    public SocialMediaShare(FBShare fbShare, TwitterShare twitterShare) {
        this.fbShare = fbShare;
        this.twitterShare = twitterShare;
    }

    public void share(String message){
        this.fbShare.setMessage(message);
        this.twitterShare.setMessage(message);
        this.fbShare.share();
        this.twitterShare.share();
    }

}
