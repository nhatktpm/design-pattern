package com.designparttern.facade;
/**
 * Structural Pattern: Facade
 * What: A Facade pattern says that just "just provide a unified and simplified to a set of interfaces
 * in the subsystem, therefore it hides the complexities of the subsystem from the client
 *
 * When: when you want to provide simple interface to o complex sub-system
 *       when several dependencies exist between clients and
 *            the implementation classes of an abstraction
 * */
public class Main {
    public static void main(String[] args) {
        SocialMediaShare socialMediaShare = new SocialMediaShare(new FBShare(),new TwitterShare());
        socialMediaShare.share(" my message share");
    }
}
