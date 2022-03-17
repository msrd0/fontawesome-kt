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

/** Children */
object FA_CHILDREN: Icon {
	
	override val name get() = "Children"
	
	override val unicode get() = "e4e1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M95.1 64C95.1 28.65 124.7 0 159.1 0C195.3 0 223.1 28.65 223.1 64C223.1 99.35 195.3 128 159.1 128C124.7 128 95.1 99.35 95.1 64zM88 480V400H70.2C59.28 400 51.57 389.3 55.02 378.9L86.16 285.5L57.5 323.3C46.82 337.4 26.75 340.2 12.67 329.5C-1.415 318.8-4.175 298.7 6.503 284.7L65.4 206.1C87.84 177.4 122.9 160 160 160C197.2 160 232.2 177.4 254.6 206.1L313.5 284.7C324.2 298.7 321.4 318.8 307.3 329.5C293.3 340.2 273.2 337.4 262.5 323.3L233.9 285.6L264.1 378.9C268.4 389.3 260.7 400 249.8 400H232V480C232 497.7 217.7 512 200 512C182.3 512 168 497.7 168 480V400H152V480C152 497.7 137.7 512 120 512C102.3 512 88 497.7 88 480H88zM416 64C416 28.65 444.7 0 480 0C515.3 0 544 28.65 544 64C544 99.35 515.3 128 480 128C444.7 128 416 99.35 416 64V64zM440 512C422.3 512 408 497.7 408 480V300.5L395.1 321C385.7 336 365.9 340.5 350.1 331.1C336 321.7 331.5 301.9 340.9 286.1L392.6 204.9C410.2 176.9 440.9 159.1 473.8 159.1H486.2C519.2 159.1 549.8 176.9 567.4 204.9L619.1 286.1C628.5 301.9 624 321.7 609 331.1C594.1 340.5 574.3 336 564.9 321L552 300.5V480C552 497.7 537.7 512 520 512C502.3 512 488 497.7 488 480V352H472V480C472 497.7 457.7 512 440 512V512z"/></svg>"""
		else -> null
	}
	
}
