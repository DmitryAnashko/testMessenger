package org.dmitry.testproject.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.dmitry.testproject.messenger.database.MockDatabase;
import org.dmitry.testproject.messenger.model.Message;
import org.dmitry.testproject.messenger.model.Profile;

public class MessageService {
	public Map<Long, Message> messages = MockDatabase.getMessages();
	public Map<Long, Profile> profiles = MockDatabase.getProfiles();

	public MessageService() {
		messages.put(1L, new Message(1, "hello", "DMitry"));
		messages.put(2L, new Message(2, "helloss", "Ilma"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		message.setCreated(new Date());
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		message.setCreated(new Date());
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
