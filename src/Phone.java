import internet.navigator.InternetNavigator;
import mobile.phone.MobilePhone;
import music.player.MusicPlayer;



public class Phone {
    public static void main(String[] args) {

        System.out.println("This is an application to simulate an iPhone functions!");

        //  My Music Player
        MusicPlayer.selectSong(10);
        MusicPlayer.play();
        MusicPlayer.pause();

        //  My Mobile Phone
        MobilePhone.call(4920202020d);
        MobilePhone.answerCall();
        MobilePhone.playVoiceMail();

        //  My Internet Navigator
        InternetNavigator.showPage("google.com");
        InternetNavigator.refreshPage();
        InternetNavigator.addPage("jetbrains.com/pt-br/idea");

    }
}