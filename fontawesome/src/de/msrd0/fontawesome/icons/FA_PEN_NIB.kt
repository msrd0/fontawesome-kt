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

/** Pen Nib */
object FA_PEN_NIB: Icon {
	
	override val name get() = "Pen Nib"
	
	override val unicode get() = "f5ad"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M368.4 18.34C390.3-3.526 425.7-3.526 447.6 18.34L493.7 64.4C515.5 86.27 515.5 121.7 493.7 143.6L437.9 199.3L312.7 74.06L368.4 18.34zM417.4 224L371.4 377.3C365.4 397.2 350.2 413 330.5 419.6L66.17 508.2C54.83 512 42.32 509.2 33.74 500.9L187.3 347.3C193.6 350.3 200.6 352 207.1 352C234.5 352 255.1 330.5 255.1 304C255.1 277.5 234.5 256 207.1 256C181.5 256 159.1 277.5 159.1 304C159.1 311.4 161.7 318.4 164.7 324.7L11.11 478.3C2.809 469.7-.04 457.2 3.765 445.8L92.39 181.5C98.1 161.8 114.8 146.6 134.7 140.6L287.1 94.6L417.4 224z"/></svg>"""
		else -> null
	}
	
}
