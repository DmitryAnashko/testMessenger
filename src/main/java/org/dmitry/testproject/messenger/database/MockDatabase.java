package org.dmitry.testproject.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.dmitry.testproject.messenger.model.Message;
import org.dmitry.testproject.messenger.model.Profile;

public class MockDatabase
{
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages()
	{
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles()
	{
		return profiles;
	}
}
