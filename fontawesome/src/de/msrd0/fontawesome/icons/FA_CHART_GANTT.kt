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

/** Chart Gantt */
object FA_CHART_GANTT: Icon {
	
	override val name get() = "Chart Gantt"
	
	override val unicode get() = "e0e4"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M32 32C49.67 32 64 46.33 64 64V400C64 408.8 71.16 416 80 416H480C497.7 416 512 430.3 512 448C512 465.7 497.7 480 480 480H80C35.82 480 0 444.2 0 400V64C0 46.33 14.33 32 32 32zM128 128C128 110.3 142.3 96 160 96H256C273.7 96 288 110.3 288 128C288 145.7 273.7 160 256 160H160C142.3 160 128 145.7 128 128zM352 192C369.7 192 384 206.3 384 224C384 241.7 369.7 256 352 256H224C206.3 256 192 241.7 192 224C192 206.3 206.3 192 224 192H352zM448 288C465.7 288 480 302.3 480 320C480 337.7 465.7 352 448 352H384C366.3 352 352 337.7 352 320C352 302.3 366.3 288 384 288H448z"/></svg>"""
		else -> null
	}
	
}
