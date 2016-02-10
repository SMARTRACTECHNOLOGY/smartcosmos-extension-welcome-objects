package net.smartcosmos.extension.smartcosmos.server.extension.welcome.objects;

/*
 * *#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*
 * SMART COSMOS Objects Welcome Page Extension
 * ===============================================================================
 * Copyright (C) 2013 - 2016 Smartrac Technology Fletcher, Inc.
 * ===============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#*#
 */

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import net.smartcosmos.extension.smartcosmos.server.extension.welcome.objects.config.WelcomeExtensionConfiguration;
import net.smartcosmos.platform.base.AbstractServerExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WelcomeExtension extends AbstractServerExtension<WelcomeExtensionConfiguration>
{
    private static final Logger LOG = LoggerFactory.getLogger(WelcomeExtension.class);
    public static final String EXTENSION_ID = "decfda6d-5aa1-49be-9c5a-5047fbc06dc9";

    protected WelcomeExtension()
    {
        super(EXTENSION_ID, "WelcomeObjectsExtension", WelcomeExtensionConfiguration.class);
    }

    @Override
    public void initialize(Bootstrap<?> bootstrap)
    {
        super.initialize(bootstrap);

        LOG.info("Initializing Assets bundle...");
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }
}
