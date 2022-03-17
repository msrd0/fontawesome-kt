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

/** Bridge Water */
object FA_BRIDGE_WATER: Icon {
	
	override val name get() = "Bridge Water"
	
	override val unicode get() = "e4ce"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M.0003 96C.0003 78.33 14.33 64 32 64H544C561.7 64 576 78.33 576 96V131.6C576 147.3 563.3 160 547.6 160C510.2 160 480 190.2 480 227.6V352.5C467.1 352.5 454.2 356.3 443.2 364.1C425.2 376.5 403 384.5 384 384.5L384 384V256C384 202.1 341 160 288 160C234.1 160 192 202.1 192 256V384L191.1 384.5C172.1 384.4 150.8 376.5 132.9 364.1C121.8 356.3 108.9 352.4 96 352.5V227.6C96 190.2 65.75 160 28.44 160C12.74 160 0 147.3 0 131.6L.0003 96zM384 416C410.9 416 439.4 405.2 461.4 389.9L461.5 389.9C473.4 381.4 489.5 382.1 500.7 391.6C515.1 403.5 533.2 412.6 551.3 416.8C568.5 420.8 579.2 438.1 575.2 455.3C571.2 472.5 553.1 483.2 536.7 479.2C512.2 473.4 491.9 462.6 478.5 454.2C449.5 469.7 417 480 384 480C352.1 480 323.4 470.1 303.6 461.1C297.7 458.5 292.5 455.8 288 453.4C283.5 455.8 278.3 458.5 272.4 461.1C252.6 470.1 223.9 480 192 480C158.1 480 126.5 469.7 97.5 454.2C84.13 462.6 63.79 473.4 39.27 479.2C22.06 483.2 4.854 472.5 .8429 455.3C-3.168 438.1 7.533 420.8 24.74 416.8C42.84 412.6 60.96 403.5 75.31 391.6C86.46 382.1 102.6 381.4 114.5 389.9L114.6 389.9C136.7 405.2 165.1 416 192 416C219.5 416 247 405.4 269.5 389.9C280.6 382 295.4 382 306.5 389.9C328.1 405.4 356.5 416 384 416H384z"/></svg>"""
		else -> null
	}
	
}
