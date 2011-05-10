/*
 * Copyright 2011 the original author or authors.
 *
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
 */
package org.springframework.data.repository.support;

import java.io.Serializable;

import org.springframework.data.repository.Repository;


/**
 * Interface for components that can provide {@link EntityInformation} this
 * interface
 *
 * @author Oliver Gierke
 */
public interface RepositoryFactoryInformation<T, ID extends Serializable> {

	/**
	 * Returns {@link EntityInformation} the repository factory is using.
	 *
	 * @return
	 */
	EntityInformation<T, ID> getEntityInformation();


	/**
	 * Returns the interface of the {@link Repository} the factory will create.
	 *
	 * @return
	 */
	Class<? extends Repository<T, ID>> getRepositoryInterface();
}
