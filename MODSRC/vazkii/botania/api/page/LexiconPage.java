/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 14, 2014, 6:17:24 PM (GMT)]
 */
package vazkii.botania.api.page;

import vazkii.botania.api.internal.IGuiLexiconEntry;

public abstract class LexiconPage {
	
	public String unlocalizedName;
	
	public LexiconPage(String unlocalizedName) {
		this.unlocalizedName = unlocalizedName;
	}
	
	/**
	 * Does the rendering for this page.
	 * @param gui The active GuiScreen
	 * @param mx The mouse's relative X position.
	 * @param my The mouse's relative Y position.
	 */
	public abstract void renderScreen(IGuiLexiconEntry gui, int mx, int my);
	
	public String getUnlocalizedName() {
		return unlocalizedName;
	}
}
