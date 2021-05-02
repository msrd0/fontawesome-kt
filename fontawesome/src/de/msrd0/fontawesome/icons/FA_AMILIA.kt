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
import de.msrd0.fontawesome.Style.BRANDS

object FA_AMILIA: Icon {
	
	override val name get() = "Amilia"
	
	override val unicode get() = "f36d"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M240.1 32c-61.9 0-131.5 16.9-184.2 55.4-5.1 3.1-9.1 9.2-7.2 19.4 1.1 5.1 5.1 27.4 10.2 39.6 4.1 10.2 14.2 10.2 20.3 6.1 32.5-22.3 96.5-47.7 152.3-47.7 57.9 0 58.9 28.4 58.9 73.1v38.5C203 227.7 78.2 251 46.7 264.2 11.2 280.5 16.3 357.7 16.3 376s15.2 104 124.9 104c47.8 0 113.7-20.7 153.3-42.1v25.4c0 3 2.1 8.2 6.1 9.1 3.1 1 50.7 2 59.9 2s62.5.3 66.5-.7c4.1-1 5.1-6.1 5.1-9.1V168c-.1-80.3-57.9-136-192-136zm50.2 348c-21.4 13.2-48.7 24.4-79.1 24.4-52.8 0-58.9-33.5-59-44.7 0-12.2-3-42.7 18.3-52.9 24.3-13.2 75.1-29.4 119.8-33.5z"/></svg>"""
		else -> null
	}
	
}
