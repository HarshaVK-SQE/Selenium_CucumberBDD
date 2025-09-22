import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RandomTest {
    public static void main(String[] args) throws InterruptedException {
        // Setup driver & options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--autoplay-policy=no-user-gesture-required");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        try {
            String videoUrl = "https://www.hotstar.com/in/..." ; // replace with actual video link
            driver.get(videoUrl);

            Thread.sleep(6000); // wait for player to load

            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Play video via HTML5 element or fallback button
            String playResult = (String) js.executeScript(
                    "try {" +
                            "  let v = document.querySelector('video');" +
                            "  if (v) { v.play(); return 'played-video-element'; }" +
                            "  let btn = document.querySelector('[aria-label*=\"Play\"]') " +
                            "          || document.querySelector('.vjs-big-play-button')" +
                            "          || document.querySelector('[data-test=\"play\"]');" +
                            "  if (btn) { btn.click(); return 'clicked-play-button'; }" +
                            "  return 'no-player-found';" +
                            "} catch(e){ return 'error:' + e.message; }"
            );
            System.out.println("Play result: " + playResult);

            Thread.sleep(6000); // let it play a bit

            // Pause video via HTML5 element or fallback button
            String pauseResult = (String) js.executeScript(
                    "try {" +
                            "  let v = document.querySelector('video');" +
                            "  if (v) { v.pause(); return 'paused-video-element'; }" +
                            "  let btn = document.querySelector('[aria-label*=\"Pause\"]') " +
                            "          || document.querySelector('.vjs-play-control');" +
                            "  if (btn) { btn.click(); return 'clicked-pause-button'; }" +
                            "  return 'no-player-found';" +
                            "} catch(e){ return 'error:' + e.message; }"
            );
            System.out.println("Pause result: " + pauseResult);

        } finally {
            Thread.sleep(2000);
            driver.quit();
        }
    }
}
