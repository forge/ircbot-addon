/*
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.irc;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.jboss.forge.container.event.PostStartup;

public class IRCBot
{
   @Inject
   private ForgeBot bot;

   public void startup(@Observes PostStartup startup) throws Exception
   {
      bot.connect("irc.freenode.net");
      bot.changeNick("forgebot");
      bot.joinChannel("#forge");
   }
}
