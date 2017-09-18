package org.o.crap.store.intf;

import java.util.concurrent.LinkedBlockingQueue;

import org.o.crap.common.Message;

public class ProducerStoreInterface
{
	LinkedBlockingQueue<Message> putQueue = new LinkedBlockingQueue<Message>();

	private static ProducerStoreInterface instance;

	private ProducerStoreInterface()
	{
	}

	public static ProducerStoreInterface getInstance()
	{
		if (instance == null)
		{
			instance = new ProducerStoreInterface();
			return instance;
		}
		else
		{
			return instance;
		}
	}
}
