/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.irc;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.forge.furnace.event.PostStartup;

/**
 * This class listens for events in the forge container and connects in the forge channel using the forgebot nick
 *
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 *
 */
public class IRCBotAddon
{
   @Inject
   private ForgeBot bot;

   public void startup(@Observes PostStartup startup) throws Exception
   {
//      bot.setVerbose(true);
      bot.connect("irc.freenode.net");
      bot.changeNick("furnacebot");
      bot.joinChannel("#forge");
   }
}
