/**
 * GB JavaCore. Homework 1
 *
 * @author Viktor A. Volkov
 * @version 6.4.2022
 */

package lesson1;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Round1");
        team1.printInformationAboutTheTeam();
        Team team2 = new Team("Round2");
        team2.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}
