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

/** Rectangle ad */
object FA_RECTANGLE_AD: Icon {
	
	override val name get() = "Rectangle ad"
	
	override val unicode get() = "f641"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M208 237.7L229.2 280H186.8L208 237.7zM416 280C416 293.3 405.3 304 392 304C378.7 304 368 293.3 368 280C368 266.7 378.7 256 392 256C405.3 256 416 266.7 416 280zM512 32C547.3 32 576 60.65 576 96V416C576 451.3 547.3 480 512 480H64C28.65 480 0 451.3 0 416V96C0 60.65 28.65 32 64 32H512zM229.5 173.3C225.4 165.1 217.1 160 208 160C198.9 160 190.6 165.1 186.5 173.3L114.5 317.3C108.6 329.1 113.4 343.5 125.3 349.5C137.1 355.4 151.5 350.6 157.5 338.7L162.8 328H253.2L258.5 338.7C264.5 350.6 278.9 355.4 290.7 349.5C302.6 343.5 307.4 329.1 301.5 317.3L229.5 173.3zM416 212.1C408.5 209.4 400.4 208 392 208C352.2 208 320 240.2 320 280C320 319.8 352.2 352 392 352C403.1 352 413.6 349.5 423 344.1C427.4 349.3 433.4 352 440 352C453.3 352 464 341.3 464 328V184C464 170.7 453.3 160 440 160C426.7 160 416 170.7 416 184V212.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_RECTANGLE_AD]. */
val FA_AD = FA_RECTANGLE_AD
