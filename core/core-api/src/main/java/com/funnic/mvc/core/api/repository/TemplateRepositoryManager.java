package com.funnic.mvc.core.api.repository;

import com.funnic.mvc.core.api.exceptions.TemplateInfoNotFoundException;
import org.osgi.framework.Bundle;

/**
 * @author Per
 */
public interface TemplateRepositoryManager {
	/**
	 * Retrieves the template URL based on the supplied name.
	 *
	 * @param bundle The bundle that requests the resource
	 * @param path   The name to the template
	 * @return Return information about the template if found; null otherwise.
	 */
	TemplateInfo getTemplateInfo(Bundle bundle, String path) throws TemplateInfoNotFoundException;
}
