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

object FA_ROAD_CIRCLE_XMARK: Icon {
	
	override val name get() = "Road Circle-xmark"
	
	override val unicode get() = "e566"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M213.2 32H288V96C288 113.7 302.3 128 320 128C337.7 128 352 113.7 352 96V32H426.8C453.9 32 478 49.08 487.1 74.63L529.8 195.2C518.9 193.1 507.6 192 496 192C436.5 192 383.9 221.6 352 266.8V224C352 206.3 337.7 192 320 192C302.3 192 288 206.3 288 224V288C288 305.7 302.3 320 320 320C322.3 320 324.6 319.7 326.8 319.3C322.4 334.7 320 351.1 320 368C320 373.4 320.2 378.7 320.7 384L320 384C302.3 384 288 398.3 288 416V480H86.61C56.45 480 32 455.5 32 425.4C32 419.2 33.06 413 35.13 407.2L152.9 74.63C161.1 49.08 186.1 32 213.2 32H213.2zM352 368C352 288.5 416.5 224 496 224C575.5 224 640 288.5 640 368C640 447.5 575.5 512 496 512C416.5 512 352 447.5 352 368zM518.6 368L555.3 331.3C561.6 325.1 561.6 314.9 555.3 308.7C549.1 302.4 538.9 302.4 532.7 308.7L496 345.4L459.3 308.7C453.1 302.4 442.9 302.4 436.7 308.7C430.4 314.9 430.4 325.1 436.7 331.3L473.4 368L436.7 404.7C430.4 410.9 430.4 421.1 436.7 427.3C442.9 433.6 453.1 433.6 459.3 427.3L496 390.6L532.7 427.3C538.9 433.6 549.1 433.6 555.3 427.3C561.6 421.1 561.6 410.9 555.3 404.7L518.6 368z"/></svg>"""
		else -> null
	}
	
}
