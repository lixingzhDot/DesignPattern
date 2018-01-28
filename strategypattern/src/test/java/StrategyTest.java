import com.lixingzh.java.designpattern.Ducks.Duck;
import com.lixingzh.java.designpattern.Ducks.MallardDuck;
import com.lixingzh.java.designpattern.Ducks.RedHeadDuck;
import com.lixingzh.java.designpattern.strategies.impl.FlyNoWay;
import com.lixingzh.java.designpattern.strategies.impl.FlyWithWings;
import com.lixingzh.java.designpattern.strategies.impl.MuteQuack;
import com.lixingzh.java.designpattern.strategies.impl.Squeak;
import org.junit.Test;

public class StrategyTest {
    @Test
    public void strategyTest() {
        Duck[] ducks = new Duck[2];

        ducks[0] = new MallardDuck(new FlyWithWings(), new Squeak());
        ducks[1] = new RedHeadDuck(new FlyNoWay(), new MuteQuack());

        for(Duck duck : ducks) {
            duck.display();
            duck.performFly();
            duck.performSquack();
        }
    }
}
