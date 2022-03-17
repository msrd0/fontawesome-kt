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

/** Building with Columns */
object FA_BUILDING_COLUMNS: Icon {
	
	override val name get() = "Building with Columns"
	
	override val unicode get() = "f19c"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M243.4 2.587C251.4-.8625 260.6-.8625 268.6 2.587L492.6 98.59C506.6 104.6 514.4 119.6 511.3 134.4C508.3 149.3 495.2 159.1 479.1 160V168C479.1 181.3 469.3 192 455.1 192H55.1C42.74 192 31.1 181.3 31.1 168V160C16.81 159.1 3.708 149.3 .6528 134.4C-2.402 119.6 5.429 104.6 19.39 98.59L243.4 2.587zM256 128C273.7 128 288 113.7 288 96C288 78.33 273.7 64 256 64C238.3 64 224 78.33 224 96C224 113.7 238.3 128 256 128zM127.1 416H167.1V224H231.1V416H280V224H344V416H384V224H448V420.3C448.6 420.6 449.2 420.1 449.8 421.4L497.8 453.4C509.5 461.2 514.7 475.8 510.6 489.3C506.5 502.8 494.1 512 480 512H31.1C17.9 512 5.458 502.8 1.372 489.3C-2.715 475.8 2.515 461.2 14.25 453.4L62.25 421.4C62.82 420.1 63.41 420.6 63.1 420.3V224H127.1V416z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BUILDING_COLUMNS]. */
val FA_BANK = FA_BUILDING_COLUMNS

/** Alias for [FA_BUILDING_COLUMNS]. */
val FA_INSTITUTION = FA_BUILDING_COLUMNS

/** Alias for [FA_BUILDING_COLUMNS]. */
val FA_MUSEUM = FA_BUILDING_COLUMNS

/** Alias for [FA_BUILDING_COLUMNS]. */
val FA_UNIVERSITY = FA_BUILDING_COLUMNS
