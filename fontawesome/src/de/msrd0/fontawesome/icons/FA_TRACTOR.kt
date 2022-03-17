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

/** Tractor */
object FA_TRACTOR: Icon {
	
	override val name get() = "Tractor"
	
	override val unicode get() = "f722"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M96 64C96 28.65 124.7 0 160 0H266.3C292.5 0 316 15.93 325.8 40.23L373.7 160H480V126.2C480 101.4 485.8 76.88 496.9 54.66L499.4 49.69C507.3 33.88 526.5 27.47 542.3 35.38C558.1 43.28 564.5 62.5 556.6 78.31L554.1 83.28C547.5 96.61 544 111.3 544 126.2V160H600C622.1 160 640 177.9 640 200V245.4C640 261.9 631.5 277.3 617.4 286.1L574.1 313.2C559.9 307.3 544.3 304 528 304C488.7 304 453.9 322.9 431.1 352H352C352 369.7 337.7 384 320 384H311.8C310.1 388.8 308.2 393.5 305.1 398.1L311.8 403.9C324.3 416.4 324.3 436.6 311.8 449.1L289.1 471.8C276.6 484.3 256.4 484.3 243.9 471.8L238.1 465.1C233.5 468.2 228.8 470.1 224 471.8V480C224 497.7 209.7 512 192 512H160C142.3 512 128 497.7 128 480V471.8C123.2 470.1 118.5 468.2 113.9 465.1L108.1 471.8C95.62 484.3 75.36 484.3 62.86 471.8L40.24 449.1C27.74 436.6 27.74 416.4 40.24 403.9L46.03 398.1C43.85 393.5 41.9 388.8 40.19 384H32C14.33 384 0 369.7 0 352V320C0 302.3 14.33 288 32 288H40.19C41.9 283.2 43.85 278.5 46.03 273.9L40.24 268.1C27.74 255.6 27.74 235.4 40.24 222.9L62.86 200.2C71.82 191.3 84.78 188.7 96 192.6L96 64zM160 64V160H304.7L266.3 64H160zM176 256C131.8 256 96 291.8 96 336C96 380.2 131.8 416 176 416C220.2 416 256 380.2 256 336C256 291.8 220.2 256 176 256zM440 424C440 394.2 454.8 367.9 477.4 352C491.7 341.9 509.2 336 528 336C530.7 336 533.3 336.1 535.9 336.3C580.8 340.3 616 378.1 616 424C616 472.6 576.6 512 528 512C479.4 512 440 472.6 440 424zM528 448C541.3 448 552 437.3 552 424C552 410.7 541.3 400 528 400C514.7 400 504 410.7 504 424C504 437.3 514.7 448 528 448z"/></svg>"""
		else -> null
	}
	
}
