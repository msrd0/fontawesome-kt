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

/** Briefcase clock */
object FA_BUSINESS_TIME: Icon {
	
	override val name get() = "Briefcase clock"
	
	override val unicode get() = "f64a"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M496 224C416.4 224 352 288.4 352 368s64.38 144 144 144s144-64.38 144-144S575.6 224 496 224zM544 384h-54.25C484.4 384 480 379.6 480 374.3V304C480 295.2 487.2 288 496 288C504.8 288 512 295.2 512 304V352h32c8.838 0 16 7.162 16 16C560 376.8 552.8 384 544 384zM320.1 352H208C199.2 352 192 344.8 192 336V288H0v144C0 457.6 22.41 480 48 480h312.2C335.1 449.6 320 410.5 320 368C320 362.6 320.5 357.3 320.1 352zM496 192c5.402 0 10.72 .3301 16 .8066V144C512 118.4 489.6 96 464 96H384V48C384 22.41 361.6 0 336 0h-160C150.4 0 128 22.41 128 48V96H48C22.41 96 0 118.4 0 144V256h360.2C392.5 216.9 441.3 192 496 192zM336 96h-160V48h160V96z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_BUSINESS_TIME]. */
val FA_BRIEFCASE_CLOCK = FA_BUSINESS_TIME
