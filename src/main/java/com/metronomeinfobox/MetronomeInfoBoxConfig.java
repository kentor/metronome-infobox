package com.metronomeinfobox;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("MetronomeInfoBox")
public interface MetronomeInfoBoxConfig extends Config
{
	@ConfigItem(
		keyName = "ticks",
		name = "Ticks",
		description = "Number of ticks to count up to until counting repeats"
	)
	default int ticks()
	{
		return 4;
	}
}
