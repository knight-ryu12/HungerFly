import org.bukkit.*;
import org.bukkit.plugin.java.JavaPlugin;
/**
 * Created by ryu on 15/08/31.
 */

public class HungerFlyMain extends JavaPlugin{
    @Override
    public void onEnable() {
        getLogger().info("onEnableメソッドが呼び出されたよ！！");
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisableメソッドが呼び出されたよ！！");
    }
}
