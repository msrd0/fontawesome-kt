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

/** Won Sign */
object FA_WON_SIGN: Icon {
	
	override val name get() = "Won Sign"
	
	override val unicode get() = "f159"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M119.1 224H183L224.1 56.24C228.5 41.99 241.3 32 256 32C270.7 32 283.5 41.99 287 56.24L328.1 224H392.9L449.6 53.88C455.2 37.12 473.4 28.05 490.1 33.64C506.9 39.23 515.9 57.35 510.4 74.12L460.4 224H480C497.7 224 512 238.3 512 256C512 273.7 497.7 288 480 288H439.1L382.4 458.1C377.9 471.6 364.1 480.5 350.8 479.1C336.6 479.4 324.4 469.6 320.1 455.8L279 288H232.1L191 455.8C187.6 469.6 175.4 479.4 161.2 479.1C147 480.5 134.1 471.6 129.6 458.1L72.94 288H32C14.33 288 .001 273.7 .001 256C.001 238.3 14.33 224 32 224H51.6L1.643 74.12C-3.946 57.35 5.115 39.23 21.88 33.64C38.65 28.05 56.77 37.12 62.36 53.88L119.1 224zM140.4 288L155.6 333.6L167 288H140.4zM248.1 224H263L256 195.9L248.1 224zM344.1 288L356.4 333.6L371.6 288H344.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_WON_SIGN]. */
val FA_KRW = FA_WON_SIGN

/** Alias for [FA_WON_SIGN]. */
val FA_WON = FA_WON_SIGN
