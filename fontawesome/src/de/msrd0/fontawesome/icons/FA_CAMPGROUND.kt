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

/** Campground */
object FA_CAMPGROUND: Icon {
	
	override val name get() = "Campground"
	
	override val unicode get() = "f6bb"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M328.1 112L563.7 405.4C571.7 415.4 576 427.7 576 440.4V464C576 490.5 554.5 512 528 512H48C21.49 512 0 490.5 0 464V440.4C0 427.7 4.328 415.4 12.27 405.4L247 112L199 51.99C187.1 38.19 190.2 18.05 204 7.013C217.8-4.027 237.9-1.789 248.1 12.01L288 60.78L327 12.01C338.1-1.789 358.2-4.027 371.1 7.013C385.8 18.05 388 38.19 376.1 51.99L328.1 112zM407.5 448L288 291.7L168.5 448H407.5z"/></svg>"""
		else -> null
	}
	
}
