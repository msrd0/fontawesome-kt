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

/** Nimblr */
object FA_NIMBLR: Icon {
	
	override val name get() = "Nimblr"
	
	override val unicode get() = "f5a8"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 384 512"><path d="M246.6 299.29c15.57 0 27.15 11.46 27.15 27s-11.62 27-27.15 27c-15.7 0-27.15-11.57-27.15-27s11.55-27 27.15-27zM113 326.25c0-15.61 11.68-27 27.15-27s27.15 11.46 27.15 27-11.47 27-27.15 27c-15.44 0-27.15-11.31-27.15-27M191.76 159C157 159 89.45 178.77 59.25 227L14 0v335.48C14 433.13 93.61 512 191.76 512s177.76-78.95 177.76-176.52S290.13 159 191.76 159zm0 308.12c-73.27 0-132.51-58.9-132.51-131.59s59.24-131.59 132.51-131.59 132.51 58.86 132.51 131.54S265 467.07 191.76 467.07z"/></svg>"""
		else -> null
	}
	
}
