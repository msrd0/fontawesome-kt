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

object FA_ALTERNATE_FONT_AWESOME: Icon {
	
	override val name get() = "Alternate Font Awesome"
	
	override val unicode get() = "f35c"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M339.3 171.2c-6 0-29.9 15.5-52.6 15.5-4.2 0-8.4-.6-12.5-2.4-19.7-7.8-37-13.7-59.1-13.7-20.3 0-41.8 6.6-59.7 13.7-1.8.6-3.6 1.2-4.8 1.8v-17.9c7.8-6 12.5-14.9 12.5-25.7 0-17.9-14.3-32.3-32.3-32.3s-32.3 14.3-32.3 32.3c0 10.2 4.8 19.7 12.5 25.7v212.1c0 10.8 9 19.7 19.7 19.7 9 0 16.1-6 18.5-13.7V385c.6-1.8.6-3 .6-4.8V336c1.2 0 2.4-.6 3-1.2 19.7-8.4 43-16.7 65.7-16.7 31.1 0 43 16.1 69.3 16.1 18.5 0 36.4-6.6 52-13.7 4.2-1.8 7.2-3.6 7.2-7.8V178.3c1.8-4.1-2.3-7.1-7.7-7.1zM397.8 32H50.2C22.7 32 0 54.7 0 82.2v347.6C0 457.3 22.7 480 50.2 480h347.6c27.5 0 50.2-22.7 50.2-50.2V82.2c0-27.5-22.7-50.2-50.2-50.2zm14.3 397.7c0 7.8-6.6 14.3-14.3 14.3H50.2c-7.8 0-14.3-6.6-14.3-14.3V82.2c0-7.8 6.6-14.3 14.3-14.3h347.6v-.1c7.8 0 14.3 6.6 14.3 14.3z"/></svg>"""
		else -> null
	}
	
}
