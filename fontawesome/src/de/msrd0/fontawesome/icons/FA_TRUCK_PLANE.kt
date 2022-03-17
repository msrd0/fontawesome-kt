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

/** Truck Plane */
object FA_TRUCK_PLANE: Icon {
	
	override val name get() = "Truck Plane"
	
	override val unicode get() = "e58f"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M256 86.06L256 182.9L256 184V411.5L256.1 411.6C257.3 433.8 269.8 452.9 288 463.4V496C288 501.2 288.8 506.3 290.4 510.1L200 480.9L109.1 511.2C104.2 512.8 98.82 511.1 94.64 508.1C90.47 505.1 88 501.1 88 496V464C88 459.1 90.21 454.5 94 451.5L144 411.5V330.3L20.6 367.3C15.75 368.8 10.51 367.9 6.449 364.8C2.391 361.8 0 357.1 0 352V288C0 282.4 2.949 277.2 7.768 274.3L144 192.5V86.06C144 54.68 169.4 0 200 0C231.5 0 256 54.68 256 86.06V86.06zM288 176C288 149.5 309.5 128 336 128H592C618.5 128 640 149.5 640 176V400C640 420.9 626.6 438.7 608 445.3V488C608 501.3 597.3 512 584 512H568C554.7 512 544 501.3 544 488V448H384V488C384 501.3 373.3 512 360 512H344C330.7 512 320 501.3 320 488V445.3C301.4 438.7 288 420.9 288 400V176zM367.8 254.7L352 304H576L560.2 254.7C556.9 246 548.9 240 539.7 240H388.3C379.1 240 371.1 246 367.8 254.7H367.8zM568 400C581.3 400 592 389.3 592 376C592 362.7 581.3 352 568 352C554.7 352 544 362.7 544 376C544 389.3 554.7 400 568 400zM360 352C346.7 352 336 362.7 336 376C336 389.3 346.7 400 360 400C373.3 400 384 389.3 384 376C384 362.7 373.3 352 360 352z"/></svg>"""
		else -> null
	}
	
}
