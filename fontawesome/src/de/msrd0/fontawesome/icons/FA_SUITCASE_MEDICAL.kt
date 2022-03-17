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

/** Suitcase medical */
object FA_SUITCASE_MEDICAL: Icon {
	
	override val name get() = "Suitcase medical"
	
	override val unicode get() = "f0fa"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 144v288C0 457.6 22.41 480 48 480H64V96H48C22.41 96 0 118.4 0 144zM464 96H448v384h16c25.59 0 48-22.41 48-48v-288C512 118.4 489.6 96 464 96zM384 48C384 22.41 361.6 0 336 0h-160C150.4 0 128 22.41 128 48V96H96v384h320V96h-32V48zM176 48h160V96h-160V48zM352 312C352 316.4 348.4 320 344 320H288v56c0 4.375-3.625 8-8 8h-48C227.6 384 224 380.4 224 376V320H168C163.6 320 160 316.4 160 312v-48C160 259.6 163.6 256 168 256H224V200C224 195.6 227.6 192 232 192h48C284.4 192 288 195.6 288 200V256h56C348.4 256 352 259.6 352 264V312z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_SUITCASE_MEDICAL]. */
val FA_MEDKIT = FA_SUITCASE_MEDICAL
