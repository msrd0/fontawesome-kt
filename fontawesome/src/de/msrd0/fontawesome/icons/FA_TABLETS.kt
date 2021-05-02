/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_TABLETS: Icon {
	
	override val name get() = "Tablets"
	
	override val unicode get() = "f490"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M160 192C78.9 192 12.5 250.5.1 326.7c-.8 4.8 3.3 9.3 8.3 9.3h303.3c5 0 9.1-4.5 8.3-9.3C307.5 250.5 241.1 192 160 192zm151.6 176H8.4c-5 0-9.1 4.5-8.3 9.3C12.5 453.5 78.9 512 160 512s147.5-58.5 159.9-134.7c.8-4.8-3.3-9.3-8.3-9.3zM593.4 46.6c-56.5-56.5-144.2-61.4-206.9-16-4 2.9-4.3 8.9-.8 12.3L597 254.3c3.5 3.5 9.5 3.2 12.3-.8 45.5-62.7 40.6-150.4-15.9-206.9zM363 65.7c-3.5-3.5-9.5-3.2-12.3.8-45.4 62.7-40.5 150.4 15.9 206.9 56.5 56.5 144.2 61.4 206.9 15.9 4-2.9 4.3-8.9.8-12.3L363 65.7z"/></svg>"""
		else -> null
	}
	
}
