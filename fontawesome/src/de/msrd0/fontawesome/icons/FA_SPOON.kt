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

object FA_SPOON: Icon {
	
	override val name get() = "Spoon"
	
	override val unicode get() = "f2e5"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M449.5 242.2C436.4 257.8 419.8 270 400.1 277.8C382.2 285.6 361.7 288.8 341.4 287C326.2 284.5 311.8 278.4 299.5 269.1L68.29 500.3C60.79 507.8 50.61 512 40 512C29.39 512 19.22 507.8 11.71 500.3C4.211 492.8-.0039 482.6-.0039 472C-.0039 461.4 4.211 451.2 11.71 443.7L243 212.5C233.7 200.2 227.6 185.8 225.1 170.6C223.3 150.3 226.5 129.9 234.3 111C242.1 92.22 254.3 75.56 269.9 62.47C337.8-5.437 433.1-20.28 482.7 29.35C532.3 78.95 517.4 174.2 449.5 242.2z"/></svg>"""
		else -> null
	}
	
}

val FA_UTENSIL_SPOON = FA_SPOON
