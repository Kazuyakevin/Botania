/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 14, 2014, 6:23:47 PM (GMT)]
 */
package vazkii.botania.api;

import java.util.ArrayList;
import java.util.List;

public final class LexiconCategory {

	public final String tag;
	public final List<LexiconEntry> entries = new ArrayList();
	
	public LexiconCategory(String tag) {
		this.tag = tag;
	}
	
}