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

/** Truck ramp box */
object FA_TRUCK_RAMP_BOX: Icon {
	
	override val name get() = "Truck ramp box"
	
	override val unicode get() = "f4de"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M640 .0003V400C640 461.9 589.9 512 528 512C467 512 417.5 463.3 416 402.7L48.41 502.9C31.36 507.5 13.77 497.5 9.126 480.4C4.48 463.4 14.54 445.8 31.59 441.1L352 353.8V64C352 28.65 380.7 0 416 0L640 .0003zM528 352C501.5 352 480 373.5 480 400C480 426.5 501.5 448 528 448C554.5 448 576 426.5 576 400C576 373.5 554.5 352 528 352zM23.11 207.7C18.54 190.6 28.67 173.1 45.74 168.5L92.1 156.1L112.8 233.4C115.1 241.9 123.9 246.1 132.4 244.7L163.3 236.4C171.8 234.1 176.9 225.3 174.6 216.8L153.9 139.5L200.3 127.1C217.4 122.5 234.9 132.7 239.5 149.7L280.9 304.3C285.5 321.4 275.3 338.9 258.3 343.5L103.7 384.9C86.64 389.5 69.1 379.3 64.52 362.3L23.11 207.7z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_TRUCK_RAMP_BOX]. */
val FA_TRUCK_LOADING = FA_TRUCK_RAMP_BOX
