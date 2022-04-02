package net.labymod.addons;
import net.labymod.api.LabyModAddon;
import net.labymod.api.events.MessageSendEvent;
import net.labymod.main.LabyMod;
import net.labymod.settings.elements.*;
import java.util.List;

public class ClearMyChat extends LabyModAddon {
    @Override
    public void onEnable() {
        this.getApi().getEventManager().register(new MessageSendEvent() {
            @Override
            public boolean onSend(String s) {
                if (s.startsWith("/clearmychat 30")) {
                    LabyMod.getInstance().displayMessageInChat("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\u00A7aYour Chat has been Cleared!");
                    String[] msg = s.split(" ");
                    if (msg.length < 3) return true;
                    String text = s.replaceFirst(msg[0], "").replaceFirst(msg[1], "").trim();
                }
                if (s.startsWith("/clearmychat 20")) {
                    LabyMod.getInstance().displayMessageInChat("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\u00A7aYour Chat has been Cleared!");
                    String[] msg = s.split(" ");
                    if (msg.length < 3) return true;
                    String text = s.replaceFirst(msg[0], "").replaceFirst(msg[1], "").trim();
                }
                if (s.startsWith("/clearmychat 10")) {
                    LabyMod.getInstance().displayMessageInChat("\n \n \n \n \n \n \n \n \n\u00A7aYour Chat has been Cleared!");
                    String[] msg = s.split(" ");
                    if (msg.length < 3) return true;
                    String text = s.replaceFirst(msg[0], "").replaceFirst(msg[1], "").trim();
                }
                if (s.startsWith("/clearmychat")) {
                    LabyMod.getInstance().displayMessageInChat("\u00A7cUsage: \u00A77/ClearMyChat \u00A78[10, 20, 30]");
                    String[] msg = s.split(" ");
                    if (msg.length < 3) return true;
                    String text = s.replaceFirst(msg[0], "").replaceFirst(msg[1], "").trim();
                }
                return false;
            }
        });
    }
    @Override
    public void loadConfig() {
    }
    @Override
    protected void fillSettings(final List<SettingsElement> list) {
    }
}