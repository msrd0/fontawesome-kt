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

object FA_ROAD_LOCK: Icon {
	
	override val name get() = "Road Lock"
	
	override val unicode get() = "e567"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M288 96C288 113.7 302.3 128 320 128C337.7 128 352 113.7 352 96V32H426.8C453.9 32 478 49.08 487.1 74.63L517.5 160.5C460.6 165.8 416 213.7 416 272V296.6C396.9 307.6 384 328.3 384 352V480H352V416C352 398.3 337.7 384 320 384C302.3 384 288 398.3 288 416V480H86.61C56.45 480 32 455.5 32 425.4C32 419.2 33.06 413 35.13 407.2L152.9 74.63C161.1 49.08 186.1 32 213.2 32H287.1L288 96zM352 224C352 206.3 337.7 192 320 192C302.3 192 288 206.3 288 224V288C288 305.7 302.3 320 320 320C337.7 320 352 305.7 352 288V224zM528 192C572.2 192 608 227.8 608 272V320C625.7 320 640 334.3 640 352V480C640 497.7 625.7 512 608 512H448C430.3 512 416 497.7 416 480V352C416 334.3 430.3 320 448 320V272C448 227.8 483.8 192 528 192zM528 240C510.3 240 496 254.3 496 272V320H560V272C560 254.3 545.7 240 528 240z"/></svg>"""
		else -> null
	}
	
}
