package net.smartcosmos.extension.smartcosmos.server.extension.welcome.objects;

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import net.smartcosmos.extension.smartcosmos.server.extension.welcome.objects.config.WelcomeExtensionConfiguration;
import net.smartcosmos.platform.base.AbstractServerExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by as on 10.02.16.
 */
public class WelcomeExtension extends AbstractServerExtension<WelcomeExtensionConfiguration> {
    private static final Logger LOG = LoggerFactory.getLogger(WelcomeExtension.class);
    public static final String EXTENSION_ID = "decfda6d-5aa1-49be-9c5a-5047fbc06dc9";

    protected WelcomeExtension() {
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
