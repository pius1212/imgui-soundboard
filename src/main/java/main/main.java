package main;

import org.ice1000.jimgui.JImDrawList;
import org.ice1000.jimgui.JImGui;
import org.ice1000.jimgui.flag.JImWindowFlags;
import org.ice1000.jimgui.util.JniLoader;

public class main {
	public static void main(String[] args) {
		JniLoader.load();
		try(JImGui imGui = new JImGui()) {
			imGui.initBeforeMainLoop();
			while (!imGui.windowShouldClose()) {
				imGui.initNewFrame();
				imGui.begin("Soundboard");

				imGui.text("daniel is a faggot");

				imGui.render();
			}
		}
	}
}
