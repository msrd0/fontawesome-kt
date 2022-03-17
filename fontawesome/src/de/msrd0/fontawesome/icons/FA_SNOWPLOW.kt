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

object FA_SNOWPLOW: Icon {
	
	override val name get() = "Snowplow"
	
	override val unicode get() = "f7d2"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M144 400C144 413.3 133.3 424 120 424C106.7 424 96 413.3 96 400C96 386.7 106.7 376 120 376C133.3 376 144 386.7 144 400zM336 400C336 386.7 346.7 376 360 376C373.3 376 384 386.7 384 400C384 413.3 373.3 424 360 424C346.7 424 336 413.3 336 400zM304 400C304 413.3 293.3 424 280 424C266.7 424 256 413.3 256 400C256 386.7 266.7 376 280 376C293.3 376 304 386.7 304 400zM176 400C176 386.7 186.7 376 200 376C213.3 376 224 386.7 224 400C224 413.3 213.3 424 200 424C186.7 424 176 413.3 176 400zM447.4 249.6C447.8 251.9 448.1 254.3 448 256.7V288H512V235.2C512 220.7 516.9 206.6 526 195.2L583 124C594.1 110.2 614.2 107.1 627.1 119C641.8 130.1 644 150.2 632.1 163.1L576 235.2V402.7L630.6 457.4C643.1 469.9 643.1 490.1 630.6 502.6C618.1 515.1 597.9 515.1 585.4 502.6L530.7 448C518.7 435.1 512 419.7 512 402.7V352H469.2C476.1 366.5 480 382.8 480 400C480 461.9 429.9 512 368 512H112C50.14 512 0 461.9 0 400C0 355.3 26.16 316.8 64 298.8V192C64 174.3 78.33 160 96 160H128V48C128 21.49 149.5 0 176 0H298.9C324.5 0 347.6 15.26 357.7 38.79L445.1 242.7C446.1 244.9 446.9 247.2 447.4 249.6H447.4zM298.9 64H192V160L256 224H367.5L298.9 64zM368 352H112C85.49 352 64 373.5 64 400C64 426.5 85.49 448 112 448H368C394.5 448 416 426.5 416 400C416 373.5 394.5 352 368 352z"/></svg>"""
		else -> null
	}
	
}
