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

object FA_ROAD_CIRCLE_CHECK: Icon {
	
	override val name get() = "Road Circle-check"
	
	override val unicode get() = "e564"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M213.2 32H288V96C288 113.7 302.3 128 320 128C337.7 128 352 113.7 352 96V32H426.8C453.9 32 478 49.08 487.1 74.63L529.8 195.2C518.9 193.1 507.6 192 496 192C436.5 192 383.9 221.6 352 266.8V224C352 206.3 337.7 192 320 192C302.3 192 288 206.3 288 224V288C288 305.7 302.3 320 320 320C322.3 320 324.6 319.7 326.8 319.3C322.4 334.7 320 351.1 320 368C320 373.4 320.2 378.7 320.7 384L320 384C302.3 384 288 398.3 288 416V480H86.61C56.45 480 32 455.5 32 425.4C32 419.2 33.06 413 35.13 407.2L152.9 74.63C161.1 49.08 186.1 32 213.2 32H213.2zM640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368zM540.7 324.7L480 385.4L451.3 356.7C445.1 350.4 434.9 350.4 428.7 356.7C422.4 362.9 422.4 373.1 428.7 379.3L468.7 419.3C474.9 425.6 485.1 425.6 491.3 419.3L563.3 347.3C569.6 341.1 569.6 330.9 563.3 324.7C557.1 318.4 546.9 318.4 540.7 324.7H540.7z"/></svg>"""
		else -> null
	}
	
}
