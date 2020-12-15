package com.classy.class_2021a_and_b7;

import java.util.ArrayList;

public class MovieMockDB {


    public static ArrayList<Movie> generateMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        movies.add(new Movie()
                .setName("Wonder Woman")
                .setContent("When a pilot crashes and tells of conflict in the outside world, Diana, an Amazonian warrior in training, leaves home to fight a war, discovering her full powers and true destiny.")
                .setActors("Gal Gadot, Chris Pine, Robin Wright")
                .setForKids(true)
                .setYear(2017)
                .setStars(3.7)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTYzODQzYjQtNTczNC00MzZhLTg1ZWYtZDUxYmQ3ZTY4NzA1XkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMjUzZTJmZDItODRjYS00ZGRhLTg2NWQtOGE0YjJhNWVlMjNjXkEyXkFqcGdeQXVyMTg4NDI0NDM@._V1_UY317_CR51,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Harry Potter and the Half-Blood Prince")
                .setContent("As Harry Potter (Daniel Radcliffe) begins his sixth year at Hogwarts, he discovers an old book marked as \"the property of the Half - Blood Prince\" and begins to learn more about Lord Voldemort's (Ralph Fiennes') dark past.")
                .setActors("Daniel Radcliffe, Emma Watson, Rupert Grint")
                .setForKids(true)
                .setYear(2009)
                .setStars(3.8)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BNzU3NDg4NTAyNV5BMl5BanBnXkFtZTcwOTg2ODg1Mg@@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BZmE0NzNiNzQtYTVlYS00MjljLWE4MTgtYzYxNjU2NjZkM2M4XkEyXkFqcGdeQXVyNjY5NDgzNjQ@._V1_UX214_CR0,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Spider-Man: Far from Home")
                .setContent("Following the events of Avengers:Endgame(2019), Spider - Man must step up to take on new threats in a world that has changed forever.")
                .setActors("Tom Holland, Samuel L. Jackson, Jake Gyllenhaal")
                .setForKids(true)
                .setYear(2019)
                .setStars(3.75)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMGZlNTY1ZWUtYTMzNC00ZjUyLWE0MjQtMTMxN2E3ODYxMWVmXkEyXkFqcGdeQXVyMDM2NDM2MQ@@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BNTAzMzA3NjQwOF5BMl5BanBnXkFtZTgwMDUzODQ5MTI@._V1_UY44_CR2,0,32,44_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("You Don't Mess with the Zohan")
                .setContent("An Israeli Special Forces Soldier fakes his death so he can re-emerge in New York City as a hair stylist.")
                .setActors(" Adam Sandler, John Turturro, Emmanuelle Chriqui")
                .setForKids(true)
                .setYear(2008)
                .setStars(2.25)
                .setImageLink("https://upload.wikimedia.org/wikipedia/en/7/77/With_the_zohan.jpg")
                .setStarImageLink("https://www.emmys.com/sites/default/files/styles/bio_pics_detail/public/bios/adam-sandler-2019-450x600.jpg?itok=GKHFjevO")
        );

        movies.add(new Movie()
                .setName("Harry Potter and the Sorcerer's Stone ")
                .setContent("An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.")
                .setActors("Daniel Radcliffe, Emma Watson, Rupert Grint")
                .setForKids(true)
                .setYear(2001)
                .setStars(7.6)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BNjQ3NWNlNmQtMTE5ZS00MDdmLTlkZjUtZTBlM2UxMGFiMTU3XkEyXkFqcGdeQXVyNjUwNzk3NDc@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BYTc0ZGFkMDAtZDUwOS00MzNhLWJmMGItODFmMmNlZmM3YzVkXkEyXkFqcGdeQXVyMjMxMDgyNzU@._V1_UY99_CR70,0,99,99_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Swiss Army Man")
                .setContent("A hopeless man stranded on a deserted island befriends a dead body and together they go on a surreal journey to get home.")
                .setActors("Paul Dano, 	Daniel Radcliffe, Mary Elizabeth Winstead")
                .setForKids(true)
                .setYear(2016)
                .setStars(7.0)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTk0OTEyMjM1OF5BMl5BanBnXkFtZTgwMzMzODM4ODE@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMjMwMzE1OTc0OF5BMl5BanBnXkFtZTcwMDU2NTg0Nw@@._V1_UY317_CR8,0,214,317_AL_.jpg")
        );
        movies.add(new Movie()
                .setName("The Avi")
                .setContent("Efrohim Hulon")
                .setActors("Avi Avraham Shakuri")
                .setForKids(true)
                .setYear(1996)
                .setStars(5.0)
                .setImageLink("https://www.football-state.com/gallery?turnirid=8787")
                .setStarImageLink("https://www.football.org.il/ImageServer/GetImage.ashx?type=2&id=28025&width=240&height=305")
        );

        movies.add(new Movie()
                .setName("Parazitim")
                .setContent("Greed and class discrimination threaten the newly formed symbiotic relationship between the wealthy Park family and the destitute Kim clan.")
                .setActors(" Song Kang-Ho, Sun-kyun Lee, Yeo-jeong Jo")
                .setForKids(false)
                .setYear(2019)
                .setStars(4.3)
                .setImageLink("http://joseignaciofilmfestival.com/wp-content/uploads/2019/12/parasite_Mesa-de-trabajo-1-copia-649x1024.jpg")
                .setStarImageLink("https://variety.com/wp-content/uploads/2019/05/rexfeatures_9989518l.jpg?resize=300,219")
        );

        movies.add(new Movie()
                .setName("Pineapple Express")
                .setContent("A process server and his marijuana dealer wind up on the run from hitmen and a corrupt police officer after he witnesses his dealer's boss murder a competitor while trying to serve papers on him.")
                .setActors(" Seth Rogen, James Franco, Gary Cole")
                .setForKids(false)
                .setYear(2008)
                .setStars(6.9)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTY1MTE4NzAwM15BMl5BanBnXkFtZTcwNzg3Mjg2MQ@@._V1_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMTQ0NjgzNzcwNV5BMl5BanBnXkFtZTcwODExMDYxOQ@@._V1_.jpg")
        );

        movies.add(new Movie()
                .setName("Frozen ")
                .setContent("When the newly crowned Queen Elsa accidentally uses her power to turn things into ice to curse her home in infinite winter, her sister Anna teams up with a mountain man, his playful reindeer, and a snowman to change the weather condition.")
                .setActors("Kristen Bell, Idina Menzel, Jonathan Groff")
                .setForKids(true)
                .setYear(2013)
                .setStars(3.7)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTQ1MjQwMTE5OF5BMl5BanBnXkFtZTgwNjk3MTcyMDE@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMjA1Njc0MTUzN15BMl5BanBnXkFtZTgwNTg1MjEwNDI@._V1_UX214_CR0,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Grown Ups")
                .setContent("After their high school basketball coach passes away, five good friends and former teammates reunite for a Fourth of July holiday weekend.")
                .setActors("Adam Sandler, Salma Hayek, Kevin James")
                .setForKids(true)
                .setYear(2010)
                .setStars(2.45)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMjA0ODYwNzU5Nl5BMl5BanBnXkFtZTcwNTI1MTgxMw@@._V1_FMjpg_UY215_.jpg 145w, https://m.media-amazon.com/images/M/MV5BMjA0ODYwNzU5Nl5BMl5BanBnXkFtZTcwNTI1MTgxMw@@._V1_FMjpg_UY323_.jpg 217w, https://m.media-amazon.com/images/M/MV5BMjA0ODYwNzU5Nl5BMl5BanBnXkFtZTcwNTI1MTgxMw@@._V1_FMjpg_UY404_.jpg 272w, https://m.media-amazon.com/images/M/MV5BMjA0ODYwNzU5Nl5BMl5BanBnXkFtZTcwNTI1MTgxMw@@._V1_FMjpg_UY691_.jpg 466w, https://m.media-amazon.com/images/M/MV5BMjA0ODYwNzU5Nl5BMl5BanBnXkFtZTcwNTI1MTgxMw@@._V1_FMjpg_UY863_.jpg")
                .setStarImageLink("https://www.emmys.com/sites/default/files/styles/bio_pics_detail/public/bios/adam-sandler-2019-450x600.jpg?itok=GKHFjevO")
        );

        movies.add(new Movie()
                .setName("Sen to Chihiro no kamikakushi")
                .setContent("During her family's move to the suburbs, a sullen 10-year-old girl wanders into a world ruled by gods, witches, and spirits, and where humans are changed into beasts.")
                .setActors("Daveigh Chase, Suzanne Pleshette, Miyu Irino")
                .setForKids(true)
                .setYear(2001)
                .setStars(4.3)
                .setImageLink("https://upload.wikimedia.org/wikipedia/en/d/db/Spirited_Away_Japanese_poster.png")
                .setStarImageLink("https://i.pinimg.com/originals/a1/16/86/a11686fa7429d9ef996ce4f6217dda14.jpg")
        );

        movies.add(new Movie()
                .setName("Hagiga B'Snuker")
                .setContent("The story is about two twin brothers, Azriel and Gavriel (both played by Yehuda Barkan). Azriel is a shy and religious Jew who works in a fruit shop in Jaffa. Gavriel, is a hoodlum and a good-for-nothing hustler who runs a Snooker Bar. Gavriel and his friend Hanuka make easy money by swindling innocent people into gambling on Snooker games. One day Gavriel is forced to renew contact with his brother, because he is in trouble with a gangster who won the bet on a snooker game, and the only way to pay is by selling the family estate which is co-owned by Gavriel and his brother Azriel.")
                .setActors(" Yehuda Barkan, Yosef Shiloach, Ze'ev Revach")
                .setForKids(true)
                .setYear(1975)
                .setStars(3.75)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTExZjkxZjYtMTNiMi00ZmE3LWI4ODUtNGI0M2NhMzVlZGMyXkEyXkFqcGdeQXVyMzU0NzkwMDg@._V1_UY268_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BNjVlZGVlNWItZTE3My00NTUyLWE3YjgtZmMwMmU3MWVjOTE4XkEyXkFqcGdeQXVyMjMyMzI4MzY@._V1_UY317_CR20,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("American Pie")
                .setContent("Four teenage boys enter a pact to lose their virginity by prom night.")
                .setActors("Jason Biggs, Chris Klein, Thomas Ian Nicholas")
                .setForKids(false)
                .setYear(1999)
                .setStars(3.5)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMTg3ODY5ODI1NF5BMl5BanBnXkFtZTgwMTkxNTYxMTE@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMTk4Mzg0NjMwMV5BMl5BanBnXkFtZTcwNDgyNzE4NQ@@._V1_UX214_CR0,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("The Room")
                .setContent("Johnny is a successful bank executive who lives quietly in a San Francisco townhouse with his fiancée, Lisa. One day, putting aside any scruple, she seduces Johnny's best friend, Mark. From there, nothing will be the same again.")
                .setActors("Tommy Wiseaum, Juliette Danielle, Greg Sestero")
                .setForKids(true)
                .setYear(2003)
                .setStars(1.85)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BYjEzN2FlYmYtNDkwMC00NGFkLWE5ODctYmE5NmYxNzE2MmRiXkEyXkFqcGdeQXVyMjMwODc5Mw@@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BNzE2ODE0ODY2M15BMl5BanBnXkFtZTgwNzI1OTcyNjE@._V1_UY317_CR12,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("The Da Vinci Code")
                .setContent("A murder inside the Louvre, and clues in Da Vinci paintings, lead to the discovery of a religious mystery protected by a secret society for two thousand years, which could shake the foundations of Christianity.")
                .setActors("Tom Hanks, Audrey Tautou, Jean Reno")
                .setForKids(true)
                .setYear(2006)
                .setStars(3.3)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BMjIxMjQyMTc3Nl5BMl5BanBnXkFtZTcwMTA1MDUzMw@@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMTQ2MjMwNDA3Nl5BMl5BanBnXkFtZTcwMTA2NDY3NQ@@._V1_UY317_CR2,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Cube")
                .setContent("Six complete strangers with widely varying personalities are involuntarily placed in an endless maze containing deadly traps.")
                .setActors("Nicole de Boer, Maurice Dean Wint, David Hewlett")
                .setForKids(false)
                .setYear(1997)
                .setStars(3.6)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BZTIyZGM3NDItMTNmNS00Yzc4LTg2MzItOWY4MTE1NDlmZDIyXkEyXkFqcGdeQXVyMTAwMzUyOTc@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMTUxY2M1OTMtZDJhZi00OTBjLTg4MDEtMzJhMTFmMjU5NmM4XkEyXkFqcGdeQXVyNjAwNjEzMg@@._V1_UY317_CR21,0,214,317_AL_.jpg")
        );

        movies.add(new Movie()
                .setName("Schindler's List")
                .setContent("In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.")
                .setActors("Liam Neeson, Ralph Fiennes, Ben Kingsley")
                .setForKids(false)
                .setYear(1993)
                .setStars(4.45)
                .setImageLink("https://m.media-amazon.com/images/M/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_UX182_CR0,0,182,268_AL_.jpg")
                .setStarImageLink("https://m.media-amazon.com/images/M/MV5BMjA1MTQ3NzU1MV5BMl5BanBnXkFtZTgwMDE3Mjg0MzE@._V1_UY317_CR52,0,214,317_AL_.jpg")
        );

//        movies.add(new Movie()
//                .setName("")
//                .setContent("")
//                .setActors("")
//                .setForKids(true)
//                .setYear(2000)
//                .setStars(4.0)
//                .setImageLink("")
//                .setStarImageLink("")
//        );

        return movies;
    }
}
