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

object FA_TENT_ARROWS_DOWN: Icon {
	
	override val name get() = "Tent Arrows-down"
	
	override val unicode get() = "e581"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M209.8 111.9C218.7 121.8 217.9 136.1 208.1 145.8L128.1 217.8C118.9 226.1 105.1 226.1 95.94 217.8L15.94 145.8C6.093 136.1 5.294 121.8 14.16 111.9C23.03 102.1 38.2 101.3 48.06 110.2L88 146.1V24C88 10.75 98.75 0 112 0C125.3 0 136 10.75 136 24V146.1L175.9 110.2C185.8 101.3 200.1 102.1 209.8 111.9H209.8zM561.8 111.9C570.7 121.8 569.9 136.1 560.1 145.8L480.1 217.8C470.9 226.1 457.1 226.1 447.9 217.8L367.9 145.8C358.1 136.1 357.3 121.8 366.2 111.9C375 102.1 390.2 101.3 400.1 110.2L440 146.1V24C440 10.75 450.7 0 464 0C477.3 0 488 10.75 488 24V146.1L527.9 110.2C537.8 101.3 552.1 102.1 561.8 111.9H561.8zM475.4 294.5C482 299.6 486.4 307 487.6 315.3L511.6 475.3C513 484.5 510.3 493.8 504.2 500.9C498.2 507.9 489.3 512 480 512H384L287.1 352V512H96C86.68 512 77.83 507.9 71.75 500.9C65.67 493.8 62.97 484.5 64.35 475.3L88.35 315.3C89.59 307 93.98 299.6 100.6 294.5L268.6 166.5C280.1 157.8 295.9 157.8 307.4 166.5L475.4 294.5z"/></svg>"""
		else -> null
	}
	
}
