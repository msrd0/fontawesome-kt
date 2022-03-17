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

object FA_PERSON_DROWNING: Icon {
	
	override val name get() = "Person Drowning"
	
	override val unicode get() = "e545"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M191.1 96.16C191.1 148.8 226.1 195.4 276.3 211.4C316.3 224.2 358.1 225.1 399.1 216.6L504.9 192.8C522.1 188.9 539.3 199.7 543.2 216.9C547.1 234.1 536.3 251.3 519.1 255.2L414.1 279.1C403.6 281.5 392.9 283.3 382.2 284.5L364.5 382.1C350.9 378.9 337.2 372.7 324.8 364.1C302.8 348.6 273.3 348.6 251.2 364.1C234 375.9 213.2 384.5 192 384.5C184.7 384.5 177 383.3 169.2 381.2L190.2 234.5C151.5 200.1 127.1 150.2 127.1 96.16V64C127.1 46.33 142.3 32 159.1 32C177.7 32 191.1 46.33 191.1 64V96.16zM255.1 127.1C255.1 92.65 284.7 63.1 320 63.1C355.3 63.1 384 92.65 384 127.1C384 163.3 355.3 191.1 320 191.1C284.7 191.1 255.1 163.3 255.1 127.1zM384 416C410.9 416 439.4 405.2 461.4 389.9L461.5 389.9C473.4 381.4 489.5 382.1 500.7 391.6C515 403.5 533.2 412.6 551.3 416.8C568.5 420.8 579.2 438.1 575.2 455.3C571.2 472.5 553.1 483.2 536.7 479.2C512.2 473.4 491.9 462.6 478.5 454.2C449.5 469.7 417 480 384 480C352.1 480 323.4 470.1 303.6 461.1C297.7 458.5 292.5 455.8 288 453.4C283.5 455.8 278.3 458.5 272.4 461.1C252.6 470.1 223.9 480 192 480C158.1 480 126.5 469.7 97.5 454.2C84.12 462.6 63.79 473.4 39.27 479.2C22.06 483.2 4.853 472.5 .8422 455.3C-3.169 438.1 7.532 420.8 24.74 416.8C42.84 412.6 60.96 403.5 75.31 391.6C86.46 382.1 102.6 381.4 114.5 389.9L114.6 389.9C136.7 405.2 165.1 416 192 416C219.5 416 247 405.4 269.5 389.9C280.6 382 295.4 382 306.5 389.9C328.1 405.4 356.5 416 384 416H384z"/></svg>"""
		else -> null
	}
	
}
