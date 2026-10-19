package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SocialLikeTest {

    @Test
    void invitesToBeTheFirstWhenNobodyLikes() {
        assertEquals("Be the first to like this", SocialLike.getLikes(new String[0]));
    }

    @Test
    void namesTheOnlyPerson() {
        assertEquals("Cartman likes this", SocialLike.getLikes(new String[] {"Cartman"}));
    }

    @Test
    void namesBothPeople() {
        assertEquals("Kenny and Cartman like this", SocialLike.getLikes(new String[] {"Kenny", "Cartman"}));
    }

    @Test
    void countsTheOthersFromThreePeople() {
        assertEquals("Kyle and 2 other people like this",
                SocialLike.getLikes(new String[] {"Kyle", "Kenny", "Cartman"}));
        assertEquals("Stan and 3 other people like this",
                SocialLike.getLikes(new String[] {"Stan", "Kyle", "Kenny", "Cartman"}));
    }
}
