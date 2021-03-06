/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 14, 2014, 6:43:03 PM (GMT)]
 */
package vazkii.botania.api.internal;

import vazkii.botania.api.page.LexiconPage;
import vazkii.botania.api.page.PageDummy;

public class DummyMethodHandler implements IInternalMethodHandler {

	@Override
	public LexiconPage textPage(String key) {
		return dummyPage(key);
	}
	
	@Override
	public LexiconPage imagePage(String key, String resource) {
		return dummyPage(resource);
	}
	
	private LexiconPage dummyPage(String key) {
		return new PageDummy(key);
	}

}
