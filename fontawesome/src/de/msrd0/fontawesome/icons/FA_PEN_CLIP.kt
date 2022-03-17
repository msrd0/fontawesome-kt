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

/** Pen clip */
object FA_PEN_CLIP: Icon {
	
	override val name get() = "Pen clip"
	
	override val unicode get() = "f305"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M492.7 58.75C517.7 83.74 517.7 124.3 492.7 149.3L440.6 201.4L310.6 71.43L362.7 19.32C387.7-5.678 428.3-5.678 453.3 19.32L492.7 58.75zM240.1 114.9C231.6 105.5 216.4 105.5 207 114.9L104.1 216.1C95.6 226.3 80.4 226.3 71.03 216.1C61.66 207.6 61.66 192.4 71.03 183L173.1 80.97C201.2 52.85 246.8 52.85 274.9 80.97L417.9 224L229.5 412.5C181.5 460.5 120.3 493.2 53.7 506.5L28.71 511.5C20.84 513.1 12.7 510.6 7.03 504.1C1.356 499.3-1.107 491.2 .4662 483.3L5.465 458.3C18.78 391.7 51.52 330.5 99.54 282.5L254.1 128L240.1 114.9z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_PEN_CLIP]. */
val FA_PEN_ALT = FA_PEN_CLIP
