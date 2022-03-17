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

/** GG Currency */
object FA_GG: Icon {
	
	override val name get() = "GG Currency"
	
	override val unicode get() = "f260"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M179.2 230.4l102.4 102.4-102.4 102.4L0 256 179.2 76.8l44.8 44.8-25.6 25.6-19.2-19.2-128 128 128 128 51.5-51.5-77.1-76.5 25.6-25.6zM332.8 76.8L230.4 179.2l102.4 102.4 25.6-25.6-77.1-76.5 51.5-51.5 128 128-128 128-19.2-19.2-25.6 25.6 44.8 44.8L512 256 332.8 76.8z"/></svg>"""
		else -> null
	}
	
}
